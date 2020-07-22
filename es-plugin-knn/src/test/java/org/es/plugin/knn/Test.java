package org.es.plugin.knn;

public class Test   {

	public static void main(String[] args) throws Exception {
		 testAddKNNDoc();
	}
	
	  /**
     * Able to add docs to KNN index
     */
    public static void testAddKNNDoc() throws Exception { 
    	KNNRestTest knn=new KNNRestTest();
    	knn.testAddKNNDoc();
    }

}
