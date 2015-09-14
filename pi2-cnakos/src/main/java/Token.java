

/* First created by JCasGen Mon Sep 14 19:48:36 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Annotation corresponding to a token within a sentence.
 * Updated by JCasGen Mon Sep 14 19:48:36 EDT 2015
 * XML source: /home/constantine/Documents/Academics/11-791/pi2-cnakos/pi2-cnakos/src/main/resources/pi2-cnakos-typesystem.xml
 * @generated */
public class Token extends EnhancedAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: parentSentence

  /** getter for parentSentence - gets The Sentence which contains the token.
   * @generated
   * @return value of the feature 
   */
  public Sentence getParentSentence() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_parentSentence == null)
      jcasType.jcas.throwFeatMissing("parentSentence", "Token");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_parentSentence)));}
    
  /** setter for parentSentence - sets The Sentence which contains the token. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setParentSentence(Sentence v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_parentSentence == null)
      jcasType.jcas.throwFeatMissing("parentSentence", "Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_parentSentence, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    