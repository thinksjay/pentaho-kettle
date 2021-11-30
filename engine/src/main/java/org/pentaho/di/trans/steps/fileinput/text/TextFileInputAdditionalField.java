package org.pentaho.di.trans.steps.fileinput.text;

import org.apache.commons.lang.StringUtils;
import org.pentaho.di.core.injection.Injection;
import org.pentaho.di.trans.steps.file.BaseFileInputAdditionalField;

/**
 * @author Jay
 * @version v1.0.0.0
 * @description TextFileInputAdditionalField
 * @date 2021-11-26 17:41
 * @modifyRecord
 */
public class TextFileInputAdditionalField extends BaseFileInputAdditionalField
{
    /**
     * 将文件中所有字段输出到给定的字段中
     */
    @Injection( name = "FILE_FIELDS_FIELD" )
    public String fileFieldsField;

    @Override
    public Object clone() {
        return super.clone();
    }

    @Override
    public void normalize() {
        super.normalize();
        if ( StringUtils.isBlank(fileFieldsField) ) {
            fileFieldsField = null;
        }
    }
}