package com.github.kklisura.cdt.definition.builder.support.java.builder;

/*-
 * #%L
 * cdt-java-protocol-builder
 * %%
 * Copyright (C) 2018 - 2023 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * Java builder factory.
 *
 * @author Kenan Klisura
 */
public interface JavaBuilderFactory {
  /**
   * Creates a class builder.
   *
   * @param packageName Package name.
   * @param className Class name.
   * @return Java class builder.
   */
  JavaClassBuilder createClassBuilder(String packageName, String className);

  /**
   * Creates a new enum builder.
   *
   * @param packageName Package name.
   * @param enumName Enum name.
   * @return Enum builder.
   */
  JavaEnumBuilder createEnumBuilder(String packageName, String enumName);

  /**
   * Creates a new interface builder.
   *
   * @param packageName Package name.
   * @param interfaceName Interface name.
   */
  JavaInterfaceBuilder createInterfaceBuilder(String packageName, String interfaceName);
}
