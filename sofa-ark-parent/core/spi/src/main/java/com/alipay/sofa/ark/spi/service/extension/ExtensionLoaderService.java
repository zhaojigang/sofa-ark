/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.ark.spi.service.extension;

import java.util.List;

/**
 * @author qilong.zql
 * @since 0.6.0
 */
public interface ExtensionLoaderService {
    /**
     * get specified extension implementation which match interfaceType and extensionName
     * @param interfaceType extensible interface type
     * @param extensionName extension name
     * @param <T> extension implementation type
     * @return
     */
    <T> T getExtensionContributor(Class<T> interfaceType, String extensionName);

    /**
     * get all extension implementation which math interfaceType, ordered from high precedence
     * to low precedence.
     * @param interfaceType extensible interface type
     * @param <T> extension implementation type
     * @return
     */
    <T> List<T> getExtensionContributor(Class<T> interfaceType);
}