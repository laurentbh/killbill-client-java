/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.ning.http.util.UTF8UrlEncoder;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class Converter {

    public static List<String> convertEnumListToStringList(List<? extends Enum> in) {
        return ImmutableList.copyOf(Iterables.transform(in, new Function<Enum, String>() {
            @Override
            public String apply(final Enum input) {
                return input.name();
            }
        }));
    }

    public static List<String> convertUUIDListToStringList(List<UUID> in) {
        return ImmutableList.copyOf(Iterables.transform(in, new Function<UUID, String>() {
            @Override
            public String apply(final UUID input) {
                return input.toString();
            }
        }));
    }

    public static List<String> convertPluginPropertyMap(Map<String, String> pluginProperties) {
        if (pluginProperties == null || pluginProperties.isEmpty()) {
            return ImmutableList.of();
        }
        List<String> result = new ArrayList<String>();
        for (final String key : pluginProperties.keySet()) {
            result.add(String.format("%s=%s", UTF8UrlEncoder.encodeQueryElement(key), UTF8UrlEncoder.encodeQueryElement(pluginProperties.get(key))));
        }
        return result;
    }

}
