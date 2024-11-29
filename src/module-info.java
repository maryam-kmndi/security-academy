/**
 * 
 */
/**
 * 
 */
module exercise7 {
	requires java.sql;
	exports exercise7.json to com.fasterxml.jackson.databind;	
	requires com.fasterxml.jackson.databind;
}