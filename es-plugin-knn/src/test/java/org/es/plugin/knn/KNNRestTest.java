package org.es.plugin.knn;

import com.amazon.opendistroforelasticsearch.knn.KNNRestTestCase;

public class KNNRestTest  extends KNNRestTestCase {
    public void testAddKNNDoc() throws Exception { 
    	createKnnIndex( INDEX_NAME, createKnnIndexMapping( FIELD_NAME, 2));
        Float[] vector  = {6.0f, 6.0f};
        addKnnDoc( INDEX_NAME, "1",  FIELD_NAME, vector);
    }
}
