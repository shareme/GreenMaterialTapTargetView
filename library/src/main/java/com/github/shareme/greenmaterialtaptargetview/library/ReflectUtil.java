/*
 * Copyright 2016 Keepsafe Software, Inc.
 * Modifications Copyright(C) 2016 Fred Grott(GrottWorkShop)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.shareme.greenmaterialtaptargetview.library;

import java.lang.reflect.Field;

class ReflectUtil {
    ReflectUtil() {}

    /** Returns the value of the given private field from the source object **/
    static Object getPrivateField(Object source, String fieldName)
            throws NoSuchFieldException, IllegalAccessException {
        final Field objectField = source.getClass().getDeclaredField(fieldName);
        objectField.setAccessible(true);
        return objectField.get(source);
    }
}
