package com.nikolavp.approval.reporters;

/*
 * #%L
 * com.github.nikolavp:approval-core
 * %%
 * Copyright (C) 2014 Nikolavp
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


import com.nikolavp.approval.Reporter;

/**
 * Reporters that use windows specific binaries, i.e. the programs that are used are not cross platform.
 * <p/>
 * If you are looking for something cross platform like gvim, emacs, you better look in {@link com.nikolavp.approval.reporters.Reporters}.
 */
public final class WindowsReporters {
    private WindowsReporters() {

    }

    private static final ExecutableDifferenceReporter NOTEPAD_PLUS_PLUS = new ExecutableDifferenceReporter("notepad++.exe", "notepad++.exe");
    private static final ExecutableDifferenceReporter BEYOND_COMPARE = new ExecutableDifferenceReporter("BCompare.exe", "BCompare.exe");
    private static final ExecutableDifferenceReporter TORTOISE_IMAGE_DIFF = new ExecutableDifferenceReporter("TortoiseIDiff.exe", "TortoiseIDiff.exe");
    private static final ExecutableDifferenceReporter TORTOISE_TEXT_DIFF = new ExecutableDifferenceReporter("TortoiseMerge.exe", "TortoiseMerge.exe");
    private static final ExecutableDifferenceReporter WIN_MERGE = new ExecutableDifferenceReporter("WinMergeU.exe", "WinMergeU.exe");

    /**
     * A reporter that calls <a href="http://notepad-plus-plus.org/">notepad++</a> to show you the results.
     *
     * @return a reporter that calls notepad++
     */
    public static Reporter notepadPlusPlus() {
        return NOTEPAD_PLUS_PLUS;
    }

    /**
     * A reporter that calls <a href="http://www.scootersoftware.com/moreinfo.php">Beyond Compare 3</a> to show you the results.
     *
     * @return a reporter that calls beyond compare
     */
    public static Reporter beyondCompare() {
        return BEYOND_COMPARE;
    }

    /**
     * A reporter that calls <a href="http://tortoisesvn.net/TortoiseIDiff.html">TortoiseIDiff</a> to show you the results.
     *
     * @return a reporter that calls tortoise image difference tool
     */
    public static Reporter tortoiseImage() {
        return TORTOISE_IMAGE_DIFF;
    }

    /**
     * A reporter that calls <a href="http://tortoisesvn.net/">TortoiseMerge</a> to show you the results.
     *
     * @return a reporter that calls tortoise difference tool for text
     */
    public static Reporter tortoiseText() {
        return TORTOISE_TEXT_DIFF;
    }

    /**
     * A reporter that calls <a href="http://winmerge.org/about/">WinMerge</a> to show you the results.
     *
     * @return a reporter that calls win merge
     */
    public static Reporter winMerge() {
        return WIN_MERGE;
    }
}
