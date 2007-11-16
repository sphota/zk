/* HtmlTag.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		2007/11/16  12:14:54 , auto generated by Ian Tsai
}}IS_NOTE

Copyright (C) 2007 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.jsp.zul;

import org.zkoss.zk.ui.Component;
import org.zkoss.zul.Html;
import org.zkoss.jsp.zul.impl.BranchTag;

/**
 * The JSP tag of {@link Html}.
 * @author Ian Tsai
 *
 */
public class HtmlTag extends BranchTag {
	/**
	 * 
	 * @param use must provide defult constractor
	 * @return new instance constracted by use class 
	 */
	protected String getJspTagName(){
		return "html";
	}

}
