import java.util.*;

class KnowledgeNode
{
 private boolean wasAsserted; // True=asserted, False=still assertable

 private String tag;  // primary key
 private ArrayList<String> tags; // formatted strings

 private int age;  // 0-1000, 0=delete, 1000=asserted
 private int activation;  // Default 0, increment at each activation
 private int threshold;  // When activation >= threshold then assert

 public void activate() {
   //What is the formula
    } //?
 
// Increments activation based on a formula
 
 public ArrayList assertTag() {
   if ((wasAsserted == true)&&(age == 1000)) { 
     return tags; }}// wasAsserted=true, age=1000, returns tags
 public void age()//what formula? :) ;  // Increments age based on a formula
 public void reset() {
   wasAsserted = false;
   activation = 0; }// wasAsserted=false, activation=0

 public boolean isAssertable(){
   if(activation >= threshhold){
     return true}
   else{
     return false;}
 }
 
       // True if activation>=threshold
 public boolean isDeleteable(){
   if(age==0){
     return true;}
   else{
     return false;}
 }
 
   // True is age==0
 */
 public KnowledgeNode(String primaryTag , ArrayList<String> otherTags, int thresh, int act, int old, boolean x) { //activation=0, age=1000
   tag = primaryTag;
   tags = otherTags;
   threshold = thresh;
   activation = act;
   age = old;
   wasAsserted = x;
 }
 
 
 }
 
 
 
