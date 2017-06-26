/*
*   This file is part of PaloKettlePlugin.
*
*   PaloKettlePlugin is free software: you can redistribute it and/or modify
*   it under the terms of the GNU Lesser General Public License as published by
*   the Free Software Foundation, either version 3 of the License, or
*   (at your option) any later version.
*
*   PaloKettlePlugin is distributed in the hope that it will be useful,
*   but WITHOUT ANY WARRANTY; without even the implied warranty of
*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*   GNU Lesser General Public License for more details.
*
*   You should have received a copy of the GNU Lesser General Public License
*   along with PaloKettlePlugin.  If not, see <http://www.gnu.org/licenses/>.
*
*   Portions Copyright 2008 Stratebi Business Solutions, S.L.
*   Portions Copyright 2011 De Bortoli Wines Pty Limited (Australia)
*   Portions Copyright 2010 - 2013 Pentaho Corporation
*/

package org.pentaho.di.palo.core;

public class DimensionField {
    private String DimensionName;
    private String FieldName;
    private String FieldType;
    
    public DimensionField(String dimensionName, String field, String fieldType) {
        this.DimensionName = dimensionName;
        this.FieldName = field;
        this.FieldType = fieldType;
    }
    
    public String getFieldName() {
        return this.FieldName;
    }
    public String getDimensionName() {
        return this.DimensionName;
    }
    public String getFieldType() {
        return this.FieldType;
}
}
