package com.ebenyx;

import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.Issue;

public class Main {

    /*
    Lien HOMO : http://192.97.212.12:26030/login.jsp



+ Un identifiant pour te connecter



Matricule CCP 3917 Mdp : Mdp2016!
     */
    public static void main(String[] args) {
        MyJiraClient myJiraClient = new MyJiraClient("cyrilleguipie", "1aqw2ZSX@", "http://localhost:8080");
        JiraRestClient jiraRestClient = myJiraClient.getJiraRestClient();
        String issueKey = myJiraClient.createIssue("COC", 10002L, "Entree en relation");
        System.out.println(issueKey);
        Issue issue = myJiraClient.getIssue(issueKey);
        System.out.println(issue.toString());

    }
}
