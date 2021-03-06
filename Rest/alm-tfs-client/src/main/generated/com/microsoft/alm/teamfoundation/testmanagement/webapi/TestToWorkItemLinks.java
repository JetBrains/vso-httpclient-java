// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.teamfoundation.testmanagement.webapi;

import java.util.ArrayList;

/** 
 */
public class TestToWorkItemLinks {

    private TestMethod test;
    private ArrayList<WorkItemReference> workItems;

    public TestMethod getTest() {
        return test;
    }

    public void setTest(final TestMethod test) {
        this.test = test;
    }

    public ArrayList<WorkItemReference> getWorkItems() {
        return workItems;
    }

    public void setWorkItems(final ArrayList<WorkItemReference> workItems) {
        this.workItems = workItems;
    }
}
