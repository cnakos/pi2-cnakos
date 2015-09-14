

/* First created by JCasGen Mon Sep 14 19:48:36 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Annotation with component name and confidence score.
 * Updated by JCasGen Mon Sep 14 19:48:36 EDT 2015
 * XML source: /home/constantine/Documents/Academics/11-791/pi2-cnakos/pi2-cnakos/src/main/resources/pi2-cnakos-typesystem.xml
 * @generated */
public class EnhancedAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EnhancedAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected EnhancedAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EnhancedAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EnhancedAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EnhancedAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: componentName

  /** getter for componentName - gets The name of the component that generated this annotation.
   * @generated
   * @return value of the feature 
   */
  public String getComponentName() {
    if (EnhancedAnnotation_Type.featOkTst && ((EnhancedAnnotation_Type)jcasType).casFeat_componentName == null)
      jcasType.jcas.throwFeatMissing("componentName", "EnhancedAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EnhancedAnnotation_Type)jcasType).casFeatCode_componentName);}
    
  /** setter for componentName - sets The name of the component that generated this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setComponentName(String v) {
    if (EnhancedAnnotation_Type.featOkTst && ((EnhancedAnnotation_Type)jcasType).casFeat_componentName == null)
      jcasType.jcas.throwFeatMissing("componentName", "EnhancedAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((EnhancedAnnotation_Type)jcasType).casFeatCode_componentName, v);}    
   
    
  //*--------------*
  //* Feature: confidenceScore

  /** getter for confidenceScore - gets The confidence of the annotator in this annotation.
   * @generated
   * @return value of the feature 
   */
  public double getConfidenceScore() {
    if (EnhancedAnnotation_Type.featOkTst && ((EnhancedAnnotation_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "EnhancedAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((EnhancedAnnotation_Type)jcasType).casFeatCode_confidenceScore);}
    
  /** setter for confidenceScore - sets The confidence of the annotator in this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidenceScore(double v) {
    if (EnhancedAnnotation_Type.featOkTst && ((EnhancedAnnotation_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "EnhancedAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((EnhancedAnnotation_Type)jcasType).casFeatCode_confidenceScore, v);}    
  }

    