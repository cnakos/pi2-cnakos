
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

/** Annotation representing a candidate answer to a question, including its correctness.
 * Updated by JCasGen Mon Sep 14 19:48:36 EDT 2015
 * @generated */
public class Answer_Type extends Sentence_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Answer");
 
  /** @generated */
  final Feature casFeat_correct;
  /** @generated */
  final int     casFeatCode_correct;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getCorrect(int addr) {
        if (featOkTst && casFeat_correct == null)
      jcas.throwFeatMissing("correct", "Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_correct);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_correct == null)
      jcas.throwFeatMissing("correct", "Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_correct, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerNumber;
  /** @generated */
  final int     casFeatCode_answerNumber;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnswerNumber(int addr) {
        if (featOkTst && casFeat_answerNumber == null)
      jcas.throwFeatMissing("answerNumber", "Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_answerNumber);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnswerNumber(int addr, int v) {
        if (featOkTst && casFeat_answerNumber == null)
      jcas.throwFeatMissing("answerNumber", "Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_answerNumber, v);}
    
  
 
  /** @generated */
  final Feature casFeat_parentQuestion;
  /** @generated */
  final int     casFeatCode_parentQuestion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getParentQuestion(int addr) {
        if (featOkTst && casFeat_parentQuestion == null)
      jcas.throwFeatMissing("parentQuestion", "Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_parentQuestion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setParentQuestion(int addr, int v) {
        if (featOkTst && casFeat_parentQuestion == null)
      jcas.throwFeatMissing("parentQuestion", "Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_parentQuestion, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_correct = jcas.getRequiredFeatureDE(casType, "correct", "uima.cas.Boolean", featOkTst);
    casFeatCode_correct  = (null == casFeat_correct) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_correct).getCode();

 
    casFeat_answerNumber = jcas.getRequiredFeatureDE(casType, "answerNumber", "uima.cas.Integer", featOkTst);
    casFeatCode_answerNumber  = (null == casFeat_answerNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerNumber).getCode();

 
    casFeat_parentQuestion = jcas.getRequiredFeatureDE(casType, "parentQuestion", "Question", featOkTst);
    casFeatCode_parentQuestion  = (null == casFeat_parentQuestion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_parentQuestion).getCode();

  }
}



    