package br.com.senior.chkbackend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCODMOVId is a Querydsl query type for CODMOVId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QCODMOVId extends BeanPath<CODMOVId> {

    private static final long serialVersionUID = -1094113239L;

    public static final QCODMOVId cODMOVId = new QCODMOVId("cODMOVId");

    public final NumberPath<Integer> cdEmpresa = createNumber("cdEmpresa", Integer.class);

    public final NumberPath<Integer> cdSequencia = createNumber("cdSequencia", Integer.class);

    public QCODMOVId(String variable) {
        super(CODMOVId.class, forVariable(variable));
    }

    public QCODMOVId(Path<? extends CODMOVId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCODMOVId(PathMetadata metadata) {
        super(CODMOVId.class, metadata);
    }

}

