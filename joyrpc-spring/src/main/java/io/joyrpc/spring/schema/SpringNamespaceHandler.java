package io.joyrpc.spring.schema;

/*-
 * #%L
 * joyrpc
 * %%
 * Copyright (C) 2019 joyrpc.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 将xml的标签绑定到解析器
 */
public class SpringNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("provider", new ProviderBeanDefinitionParser());
        registerBeanDefinitionParser("consumer", new ConsumerBeanDefinitionParser());
        registerBeanDefinitionParser("consumerGroup", new ConsumerGroupBeanDefinitionParser());
        registerBeanDefinitionParser("server", new ServerBeanDefinitionParser());
        registerBeanDefinitionParser("registry", new RegistryBeanDefinitionParser());
        registerBeanDefinitionParser("parameter", new GlobalParameterDefinitionParser());
        registerBeanDefinitionParser("annotation", new AnnotationBeanDefinitionParser());
    }
}
