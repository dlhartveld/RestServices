// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.consume.RestConsumer;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class addCookieToNextRequest extends CustomJavaAction<Boolean>
{
	private IMendixObject __cookie;
	private restservices.proxies.Cookie cookie;

	public addCookieToNextRequest(IContext context, IMendixObject cookie)
	{
		super(context);
		this.__cookie = cookie;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.cookie = __cookie == null ? null : restservices.proxies.Cookie.initialize(getContext(), __cookie);

		// BEGIN USER CODE
		RestConsumer.addCookieToNextRequest(cookie);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "addCookieToNextRequest";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
