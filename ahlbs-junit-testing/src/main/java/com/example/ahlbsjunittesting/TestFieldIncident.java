package com.example.ahlbsjunittesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestFieldIncidentTest {

    private FieldIncidentService fieldIncidentService;

    @BeforeEach
    public void setUp() {
        fieldIncidentService = new FieldIncidentService();
    }

    @Test
    public void testGetTestMethod() {
        // Perform the necessary setup for the get test method

        // Call the getTestMethod from FieldIncidentService
        String result = fieldIncidentService.getTestMethod();

        // Assert the result
        assertEquals("Get test method", result);
    }

    @Test
    public void testPostTestMethod() {
        // Perform the necessary setup for the post test method

        // Call the postTestMethod from FieldIncidentService
        String result = fieldIncidentService.postTestMethod();

        // Assert the result
        assertEquals("Post test method", result);
    }

    @Test
    public void testUpdateTestMethod() {
        // Perform the necessary setup for the update test method

        // Call the updateTestMethod from FieldIncidentService
        String result = fieldIncidentService.updateTestMethod();

        // Assert the result
        assertEquals("Update test method", result);
    }

    @Test
    public void testDeleteTestMethod() {
        // Perform the necessary setup for the delete test method

        // Call the deleteTestMethod from FieldIncidentService
        String result = fieldIncidentService.deleteTestMethod();

        // Assert the result
        assertEquals("Delete test method", result);
    }
}
