
/* First created by JCasGen Mon Sep 14 19:48:36 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Annotation corresponding to a token within a sentence.
 * Updated by JCasGen Mon Sep 14 19:48:36 EDT 2015
 * @generated */
public class Token_Type extends EnhancedAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Token");
 
  /** @generated */
  final Feature casFeat_parentSentence;
  /** @generated */
  final int     casFeatCode_parentSentence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getParentSentence(int addr) {
        if (featOkTst && casFeat_parentSentence == null)
      jcas.throwFeatMissing("parentSentence", "Token");
    return ll_cas.ll_getRefValue(addr, casFeatCode_parentSentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setParentSentence(int addr, int v) {
        if (featOkTst && casFeat_parentSentence == null)
      jcas.throwFeatMissing("parentSentence", "Token");
    ll_cas.ll_setRefValue(addr, casFeatCode_parentSentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_parentSentence = jcas.getRequiredFeatureDE(casType, "parentSentence", "Sentence", featOkTst);
    casFeatCode_parentSentence  = (null == casFeat_parentSentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_parentSentence).getCode();

  }
}



    