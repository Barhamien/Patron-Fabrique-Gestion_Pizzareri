/**
 * 
 */
package abs_inter;

import factory.FactoryFR;
import factory.FactorySN;
import factory.FactoryUSA;

/**
 * @author Adama SOW
 *
 */
public interface AbstractFactory {

	//public abstract AbstractOriental createOrientale();
	public AbstractOriental getOrientale();
	public AbstractReine getReine();
	public AbstractTroisFrommage getTroisFrommage();
	
	public static AbstractFactory getFactory(String type){
		AbstractFactory factory;
		if(type.equals("FR")){
			factory=new FactoryFR();
		}
		else if (type.equals("SN")) {
			factory=new FactorySN();
		}
		else {
			factory=new FactoryUSA();
		}
		return factory;
	}
}
