/*
 * Copyright (c) 2013, 2021, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.graalvm.compiler.truffle.runtime;

import org.graalvm.compiler.truffle.common.TruffleCompilable;

/**
 * @deprecated this class is schedule for removal. Use {@link AbstractCompilationTask} instead.
 */
@Deprecated
public class TruffleInlining {

    private final AbstractCompilationTask task;

    public TruffleInlining(AbstractCompilationTask task) {
        this.task = task;
    }

    public int countCalls() {
        return task.countCalls();
    }

    public int countInlinedCalls() {
        return task.countInlinedCalls();
    }

    public TruffleCompilable[] inlinedTargets() {
        return task.inlinedTargets();
    }

    public void addInlinedTarget(TruffleCompilable target) {
        task.addInlinedTarget(target);
    }

    public void setCallCounts(int total, int inlined) {
        task.setCallCounts(total, inlined);
    }

    public void addTargetToDequeue(TruffleCompilable target) {
        task.addTargetToDequeue(target);
    }

    public void dequeueTargets() {
        task.dequeueTargets();
    }

}
