// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package tests.actions;

import java.util.regex.Pattern;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class quote extends CustomJavaAction<String>
{
	private String unquotedLiteral;

	public quote(IContext context, String unquotedLiteral)
	{
		super(context);
		this.unquotedLiteral = unquotedLiteral;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return Pattern.quote(unquotedLiteral);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "quote";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
