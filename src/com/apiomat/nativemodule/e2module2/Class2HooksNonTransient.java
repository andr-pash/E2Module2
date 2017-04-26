/*
 * Copyright (c) 2011 - 2017, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.e2module2;

import java.util.*;

import com.apiomat.nativemodule.*;
import com.apiomat.nativemodule.basics.User;


/**
* Generated class for hooks on your Class2 data model
*/

public class Class2HooksNonTransient<T extends Class2> implements IModelHooksNonTransient<Class2>
{
    protected Class2 model;

    @Override
    public void setCallingModel( Class2 model )
    {
        this.model = model;
    }


    /*
     * Following Methods can be used if your data model is NOT set to TRANSIENT
     */

    @Override
    public void beforePost( Class2 obj, Request r )
    {
    }

    @Override
    public void afterPost( Class2 obj, Request r )
    {
    }
    @Override
    public void beforeGet( String id, Request r )
    {
    }
    
    @Override
    public void afterGet( Class2 obj, Request r )
    {
    }
    @Override
    public boolean beforePut( Class2 objFromDB, Class2 obj, Request r )
    {
        return false;
    }

    @Override
    public void afterPut( Class2 obj, Request r )
    {
    }

    @Override
    public boolean beforeDelete( Class2 obj, Request r )
    {
        return false;
    }
    @Override
    public String beforeGetAll( String query, Request r )
    {
        /* NOTE that returning null or "" would ignore any query and always return any object of this class and backend */
        return query;
    }
    @Override
    public List<Class2> afterGetAll( List<Class2> objects, String query, Request r )
    {
        /*
         * If you want to change the returned list of elements, you have to create a new list
         * and add the elements to return to it. Because getting elements from the "objects"
         * list will return a copy, changing values in this list does not have any effect.
         *
         * If NULL is returned, unnecessary conversions are omitted and result is taken from database.
         */
        return null;
    }

    @Override
    public boolean beforePostRef( Class2 obj, Object referencedObject, String referenceName, Request r )
    {
        return false;
    }

    @Override
    public void afterPostRef( Class2 obj, Object referencedObject, String referenceName, Request r )
    {
    }

    @Override
    public boolean beforeDeleteRef( Class2 obj, Object referencedObject, String referenceName, Request r )
    {
        return false;
    }

    @Override
    public void afterDeleteRef( Class2 obj, Object referencedObject, String referenceName, Request r )
    {
    }
    @Override
    public String beforeGetAllReferences( String query, String referenceName, Request r )
    {
        /* NOTE that returning null or "" would ignore any query and always return any referenced object */
        return query;
    }
    @Override
    public <Z extends AbstractClientDataModel> List<Z> afterGetAllReferences( List<Z> objects, String query,
        String referenceName, Request request )
    {
            return null; // return objects here if you changed sth; returning null prevents unnecessary conversions
    }
}
