package com.leokom;

import java.util.Set;

import javax.validation.constraints.NotNull;

public class Request {
    private Set<@NotNull Long> ids;
}
