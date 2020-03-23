package com.graphql.demolzy.Array;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.StaticDataFetcher;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;

import java.util.LinkedList;
import java.util.Stack;

import static graphql.schema.idl.RuntimeWiring.newRuntimeWiring;

public class HelloWorld {


    private int size;
    public static void helloWorld() {
        LinkedList l = new LinkedList();
    }


    public void pop() {
        int a = size++;
        System.out.println(a);
    }


    Stack s = new Stack();
}