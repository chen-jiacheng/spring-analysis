package com.chenjiacheng.spring.beans.spring.core;

import org.springframework.core.AliasRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by chenjiacheng on 2023/12/17 19:40
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class DefaultAliasRegistry implements AliasRegistry {

    private final Map<String, String> aliasMap = new ConcurrentHashMap<>(16);


    @Override
    public void registerAlias(String name, String alias) {
        synchronized (this.aliasMap) {
            if (alias.equals(name)) {
                this.aliasMap.remove(name);
            } else {
                String registeredName = this.aliasMap.get(alias);
                if (registeredName != null) {
                    if (registeredName.equals(name)) {
                        // An existing alias - no need to re-register
                        return;
                    }
                }
                checkForAliasCircle(name, alias);
                this.aliasMap.put(alias, name);
            }
        }
    }

    private void checkForAliasCircle(String name, String alias) {

    }

    @Override
    public void removeAlias(String alias) {

    }

    @Override
    public boolean isAlias(String name) {
        return false;
    }

    @Override
    public String[] getAliases(String name) {
        return new String[0];
    }
}
