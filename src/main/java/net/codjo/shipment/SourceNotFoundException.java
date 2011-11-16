/*
 * codjo.net
 *
 * Common Apache License 2.0
 */
package net.codjo.shipment;
/**
 * Cette exception est lanc�e par un {@link MultiFormattedDataField} afin d'indiquer que
 * la source est introuvable dans le tableau des {@link
 * net.codjo.imports.common.translator.Translator}.
 * 
 * <p>
 * NB: c'est-�-dire la source n'est pas parametr�e.
 * </p>
 *
 * @author $Author: rivierv $
 * @version $Revision: 1.2 $
 */
public class SourceNotFoundException extends ConversionFailureException {
    /**
     * Constructeur
     *
     * @param msg message d'erreur.
     */
    public SourceNotFoundException(String msg) {
        super(msg);
    }
}
