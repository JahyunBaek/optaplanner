/*
 * Copyright 2022 Red Hat, Inc. and/or its affiliates.
 *
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
 */

package org.optaplanner.constraint.streams.bavet.common.index;

/**
 * No instance of implementing classes is expected to equal any instance other than itself.
 * Index properties are cached in tuples and each tuple carries its unique instance.
 */
public interface IndexProperties {

    /**
     * Retrieves index property at a given position.
     * 
     * @param index
     * @return never null
     * @param <Type_> {@link ComparisonIndexer} will expect this to implement {@link Comparable}.
     */
    <Type_> Type_ getProperty(int index);

    /**
     *
     * @param fromInclusive position of the first index property to be part of the key, inclusive
     * @param toExclusive position of the last index property to be part of the key, exclusive
     * @return never null;
     * @param <Type_> any type understanding that two keys may point to different tuples unless their instances are equal
     */
    <Type_> Type_ getIndexerKey(int fromInclusive, int toExclusive);

}