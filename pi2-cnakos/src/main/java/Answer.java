

/* First created by JCasGen Mon Sep 14 19:48:36 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Annotation representing a candidate answer to a question, including its correctness.
 * Updated by JCasGen Mon Sep 14 19:48:36 EDT 2015
 * XML source: /home/constantine/Documents/Academics/11-791/pi2-cnakos/pi2-cnakos/src/main/resources/pi2-cnakos-typesystem.xml
 * @generated */
public class Answer extends Sentence {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: correct

  /** getter for correct - gets True if the candidate answer is correct, false otherwise.
   * @generated
   * @return value of the feature 
   */
  public boolean getCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_correct == null)
      jcasType.jcas.throwFeatMissing("correct", "Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_correct);}
    
  /** setter for correct - sets True if the candidate answer is correct, false otherwise. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_correct == null)
      jcasType.jcas.throwFeatMissing("correct", "Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_correct, v);}    
   
    
  //*--------------*
  //* Feature: answerNumber

  /** getter for answerNumber - gets The number of an answer within its parent question.
   * @generated
   * @return value of the feature 
   */
  public int getAnswerNumber() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerNumber == null)
      jcasType.jcas.throwFeatMissing("answerNumber", "Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_answerNumber);}
    
  /** setter for answerNumber - sets The number of an answer within its parent question. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswerNumber(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerNumber == null)
      jcasType.jcas.throwFeatMissing("answerNumber", "Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_answerNumber, v);}    
   
    
  //*--------------*
  //* Feature: parentQuestion

  /** getter for parentQuestion - gets The Question that this Answer attempts to answer.
   * @generated
   * @return value of the feature 
   */
  public Question getParentQuestion() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_parentQuestion == null)
      jcasType.jcas.throwFeatMissing("parentQuestion", "Answer");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_parentQuestion)));}
    
  /** setter for parentQuestion - sets The Question that this Answer attempts to answer. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setParentQuestion(Question v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_parentQuestion == null)
      jcasType.jcas.throwFeatMissing("parentQuestion", "Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_parentQuestion, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    