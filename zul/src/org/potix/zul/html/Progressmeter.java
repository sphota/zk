/* Progressmeter.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Mon Aug 14 16:38:24     2006, Created by tomyeh@potix.com
}}IS_NOTE

Copyright (C) 2006 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package com.potix.zul.html;

import com.potix.xml.HTMLs;

import com.potix.zk.ui.UiException;
import com.potix.zul.html.impl.XulElement;

/**
 * A progress meter is a bar that indicates how much of a task has been completed. 
 *
 * <p>Default {@link #getSclass}: progressmeter.
 *
 * @author <a href="mailto:tomyeh@potix.com">tomyeh@potix.com</a>
 */
public class Progressmeter extends XulElement {
	private int _val;

	public Progressmeter() {
		setSclass("progressmeter");
		setWidth("100px");
	}
	public Progressmeter(int value) {
		this();
		setValue(value);
	}

	/** Sets the current value of the progress meter.
	 * <p>Range: 0~100.
	 */
	public void setValue(int value) {
		if (value < 0 || value > 100)
			throw new UiException("Illegal value: "+value+". Range: 0 ~ 100");
		if (_val != value) {
			_val = value;
			smartUpdate("zk_val", _val);
		}
	}
	/** Returns the current value of the progress meter.
	 */
	public int getValue() {
		return _val;
	}

	//-- super --//
	public String getOuterAttrs() {
		final StringBuffer sb =
			new StringBuffer(64).append(super.getOuterAttrs());
		HTMLs.appendAttribute(sb, "zk_val", _val);
		return sb.toString();
	}

	//-- Component --//
	public boolean isChildable() {
		return false;
	}
}
