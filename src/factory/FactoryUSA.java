/**
 * 
 */
package factory;

import abs_inter.AbstractFactory;
import abs_inter.AbstractOriental;
import abs_inter.AbstractReine;
import abs_inter.AbstractTroisFrommage;
import oriental.OrientaleSN;
import oriental.OrientaleUSA;
import reine.ReineUSA;
import troisFromage.TroisFrommageUSA;

/**
 * @author ADAMA SOW
 *
 */
public class FactoryUSA implements AbstractFactory{

	@Override
	public AbstractOriental getOrientale() {
		// TODO Auto-generated method stub
		return new OrientaleUSA();
	}

	@Override
	public AbstractReine getReine() {
		// TODO Auto-generated method stub
		return new ReineUSA();
	}

	@Override
	public AbstractTroisFrommage getTroisFrommage() {
		// TODO Auto-generated method stub
		return new TroisFrommageUSA();
	}

}
