

/* First created by JCasGen Mon Sep 14 19:48:36 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** Annotation representing the text of a question.
 * Updated by JCasGen Mon Sep 14 19:48:36 EDT 2015
 * XML source: /home/constantine/Documents/Academics/11-791/pi2-cnakos/pi2-cnakos/src/main/resources/pi2-cnakos-typesystem.xml
 * @generated */
public class Question extends Sentence {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: candidateAnswers

  /** getter for candidateAnswers - gets Array of candidate answers for the question.
   * @generated
   * @return value of the feature 
   */
  public FSArray getCandidateAnswers() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_candidateAnswers == null)
      jcasType.jcas.throwFeatMissing("candidateAnswers", "Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_candidateAnswers)));}
    
  /** setter for candidateAnswers - sets Array of candidate answers for the question. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCandidateAnswers(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_candidateAnswers == null)
      jcasType.jcas.throwFeatMissing("candidateAnswers", "Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_candidateAnswers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for candidateAnswers - gets an indexed value - Array of candidate answers for the question.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Answer getCandidateAnswers(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_candidateAnswers == null)
      jcasType.jcas.throwFeatMissing("candidateAnswers", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_candidateAnswers), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_candidateAnswers), i)));}

  /** indexed setter for candidateAnswers - sets an indexed value - Array of candidate answers for the question.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCandidateAnswers(int i, Answer v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_candidateAnswers == null)
      jcasType.jcas.throwFeatMissing("candidateAnswers", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_candidateAnswers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_candidateAnswers), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: questionNumber

  /** getter for questionNumber - gets The number of the question.  Used for user-facing identification/reference.
   * @generated
   * @return value of the feature 
   */
  public int getQuestionNumber() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_questionNumber == null)
      jcasType.jcas.throwFeatMissing("questionNumber", "Question");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Question_Type)jcasType).casFeatCode_questionNumber);}
    
  /** setter for questionNumber - sets The number of the question.  Used for user-facing identification/reference. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuestionNumber(int v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_questionNumber == null)
      jcasType.jcas.throwFeatMissing("questionNumber", "Question");
    jcasType.ll_cas.ll_setIntValue(addr, ((Question_Type)jcasType).casFeatCode_questionNumber, v);}    
  }

    