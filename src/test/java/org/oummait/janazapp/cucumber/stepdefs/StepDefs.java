package org.oummait.janazapp.cucumber.stepdefs;

import org.oummait.janazapp.JanazappApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JanazappApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
