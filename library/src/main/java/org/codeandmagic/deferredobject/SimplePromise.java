/*
 * Copyright (c) 2014 Cristian Vrabie, Evelina Vrabie.
 *
 * This file is part of android-deferred-object.
 * android-deferred-object is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation, either version 3 of the License,or (at your option) any later version.
 *
 * android-deferred-object is distributed in the hope that it will be useful, butWITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with android-deferred-object.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.codeandmagic.deferredobject;

/**
 * Simplified version of {@link org.codeandmagic.deferredobject.Promise} which returns a {@link java.lang.Throwable}
 * in case of failure and has no support for progress.
 *
 * Created by cristian on 10/02/2014.
 */
public interface SimplePromise<Success> extends Promise<Success, Throwable, Void> {

    public <Success2> SimplePromise<Success2> map(MapTransformation<Success, Success2> transform);

}