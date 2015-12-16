

package uimaui;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * @generated */
public class Topic extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Topic.class);
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
  protected Topic() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Topic(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Topic(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Topic(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "uimaui.Topic");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Topic_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "uimaui.Topic");
    jcasType.ll_cas.ll_setStringValue(addr, ((Topic_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: title

  /** getter for title - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTitle() {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "uimaui.Topic");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Topic_Type)jcasType).casFeatCode_title);}
    
  /** setter for title - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "uimaui.Topic");
    jcasType.ll_cas.ll_setStringValue(addr, ((Topic_Type)jcasType).casFeatCode_title, v);}    
   
    
  //*--------------*
  //* Feature: correct

  /** getter for correct - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getCorrect() {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_correct == null)
      jcasType.jcas.throwFeatMissing("correct", "uimaui.Topic");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Topic_Type)jcasType).casFeatCode_correct);}
    
  /** setter for correct - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCorrect(boolean v) {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_correct == null)
      jcasType.jcas.throwFeatMissing("correct", "uimaui.Topic");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Topic_Type)jcasType).casFeatCode_correct, v);}    
   
    
  //*--------------*
  //* Feature: probability

  /** getter for probability - gets 
   * @generated
   * @return value of the feature 
   */
  public double getProbability() {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_probability == null)
      jcasType.jcas.throwFeatMissing("probability", "uimaui.Topic");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Topic_Type)jcasType).casFeatCode_probability);}
    
  /** setter for probability - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProbability(double v) {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_probability == null)
      jcasType.jcas.throwFeatMissing("probability", "uimaui.Topic");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Topic_Type)jcasType).casFeatCode_probability, v);}    
  }

    