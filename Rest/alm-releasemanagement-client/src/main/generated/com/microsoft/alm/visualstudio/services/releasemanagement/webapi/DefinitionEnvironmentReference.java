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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;


/** 
 */
public class DefinitionEnvironmentReference {

    private int definitionEnvironmentId;
    private int releaseDefinitionId;

    public int getDefinitionEnvironmentId() {
        return definitionEnvironmentId;
    }

    public void setDefinitionEnvironmentId(final int definitionEnvironmentId) {
        this.definitionEnvironmentId = definitionEnvironmentId;
    }

    public int getReleaseDefinitionId() {
        return releaseDefinitionId;
    }

    public void setReleaseDefinitionId(final int releaseDefinitionId) {
        this.releaseDefinitionId = releaseDefinitionId;
    }
}
