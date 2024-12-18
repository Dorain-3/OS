package org.os.os.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 31749
 */
@Data
public class Node {

    private boolean isDirectory;

    private List<Node> children;

    private Node parent;

    public Node(){

    }

    public Node( boolean isDirectory) {
        this.isDirectory = isDirectory;
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        children.add(child);
        child.setParent(this);
    }


}

