/**
 * 
 */
package factory;

import abs_inter.AbstractFactory;
import abs_inter.AbstractOriental;
import abs_inter.AbstractReine;
import abs_inter.AbstractTroisFrommage;
import oriental.OrientaleFR;
import reine.ReineFR;
import troisFromage.TroisFrommageFR;

/**
 * @author Adama SOW
 *
 */
public class FactoryFR implements AbstractFactory {
	@Override
	public AbstractOriental getOrientale() {
		// TODO Auto-generated method stub
		return new OrientaleFR();
	}

	@Override
	public AbstractReine getReine() {
		// TODO Auto-generated method stub
		return new ReineFR();
	}

	@Override
	public AbstractTroisFrommage getTroisFrommage() {
		// TODO Auto-generated method stub
		return new TroisFrommageFR();
	}

	/*@Override
	public AbstractTroisFrommage getTroisFrommage() {
		// TODO Auto-generated method stub
		return new TroisFrommageFR();
	}*/

	
	
}

	
