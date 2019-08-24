package com.medium.instance.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

abstract public class Controller<response, request> {

    abstract public ResponseEntity<response> list();

    abstract public ResponseEntity<response> get(@PathVariable String id);

    abstract public ResponseEntity<response> insert(@Valid @RequestBody request param);

    abstract public ResponseEntity<response> update(@Valid @RequestBody request param);

    abstract public ResponseEntity<response> delete(@PathVariable String id);


}