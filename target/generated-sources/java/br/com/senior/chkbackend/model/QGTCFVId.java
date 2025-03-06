package br.com.senior.chkbackend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGTCFVId is a Querydsl query type for GTCFVId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QGTCFVId extends BeanPath<GTCFVId> {

    private static final long serialVersionUID = 1162888815L;

    public static final QGTCFVId gTCFVId = new QGTCFVId("gTCFVId");

    public final NumberPath<Integer> cdEmpresa = createNumber("cdEmpresa", Integer.class);

    public final NumberPath<Integer> nrFicha = createNumber("nrFicha", Integer.class);

    public QGTCFVId(String variable) {
        super(GTCFVId.class, forVariable(variable));
    }

    public QGTCFVId(Path<? extends GTCFVId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGTCFVId(PathMetadata metadata) {
        super(GTCFVId.class, metadata);
    }

}

