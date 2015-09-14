
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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Annotation with component name and confidence score.
 * Updated by JCasGen Mon Sep 14 19:48:36 EDT 2015
 * @generated */
public class EnhancedAnnotation_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (EnhancedAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = EnhancedAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new EnhancedAnnotation(addr, EnhancedAnnotation_Type.this);
  			   EnhancedAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new EnhancedAnnotation(addr, EnhancedAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EnhancedAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("EnhancedAnnotation");
 
  /** @generated */
  final Feature casFeat_componentName;
  /** @generated */
  final int     casFeatCode_componentName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getComponentName(int addr) {
        if (featOkTst && casFeat_componentName == null)
      jcas.throwFeatMissing("componentName", "EnhancedAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_componentName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComponentName(int addr, String v) {
        if (featOkTst && casFeat_componentName == null)
      jcas.throwFeatMissing("componentName", "EnhancedAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_componentName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidenceScore;
  /** @generated */
  final int     casFeatCode_confidenceScore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidenceScore(int addr) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "EnhancedAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidenceScore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidenceScore(int addr, double v) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "EnhancedAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidenceScore, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EnhancedAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_componentName = jcas.getRequiredFeatureDE(casType, "componentName", "uima.cas.String", featOkTst);
    casFeatCode_componentName  = (null == casFeat_componentName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_componentName).getCode();

 
    casFeat_confidenceScore = jcas.getRequiredFeatureDE(casType, "confidenceScore", "uima.cas.Double", featOkTst);
    casFeatCode_confidenceScore  = (null == casFeat_confidenceScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidenceScore).getCode();

  }
}



    