/*
 * codjo.net
 *
 * Common Apache License 2.0
 */
package net.codjo.shipment;
/**
 * Cette exception est lanc�e par une op�ration {@link DataField} afin d'indiquer que le
 * champ n'est pas au bon format.
 * 
 * <p>
 * Exemple: Le type attendu est une date, mais le type re�u est un r�el.
 * </p>
 *
 * @author $Author: rivierv $
 * @version $Revision: 1.2 $
 */
public class BadFormatException extends ConversionFailureException {
    public BadFormatException(Exception cause) {
        super(cause);
    }
}
