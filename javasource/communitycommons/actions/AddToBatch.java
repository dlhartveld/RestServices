// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.Batches;

/**
 * Add an object to a batch.
 * - GenericEntity : the object to be added
 * - uniqueBatchIdentfier: the batch to be added to. If the name does not exist, a new batch will be created. Batches are unique per session. 
 * 
 * The method is borrowed from the Random Data Generator. 
 * https://appstore.mendix.com/link/app/Random%20data%20generator
 * 
 *  See its documentation for more details.
 */
public class AddToBatch extends UserAction<Boolean>
{
	private IMendixObject genericEntity;
	private String uniqueBatchIdentifier;

	public AddToBatch(IMendixObject genericEntity, String uniqueBatchIdentifier)
	{
		super();
		this.genericEntity = genericEntity;
		this.uniqueBatchIdentifier = uniqueBatchIdentifier;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		Batches.addToBatch(this.getContext(), this.uniqueBatchIdentifier, this.genericEntity);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "AddToBatch";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}