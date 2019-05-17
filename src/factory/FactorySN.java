/**
 * 
 */
package factory;

import abs_inter.AbstractFactory;
import abs_inter.AbstractOriental;
import abs_inter.AbstractReine;
import abs_inter.AbstractTroisFrommage;
import oriental.OrientaleFR;
import oriental.OrientaleSN;
import reine.ReineFR;
import reine.ReineSN;
import troisFromage.TroisFrommageFR;

/**
 * @author ADAMA SOW
 *
 */
public class FactorySN implements AbstractFactory{

	@Override
	public AbstractOriental getOrientale() {
		// TODO Auto-generated method stub
		return new OrientaleSN();
	}

	@Override
	public AbstractReine getReine() {
		// TODO Auto-generated method stub
		return new ReineSN();
	}

	@Override
	public AbstractTroisFrommage getTroisFrommage() {
		// TODO Auto-generated method stub
		return new TroisFrommageFR();
	}

}
