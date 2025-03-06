package br.com.senior.chkbackend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGTCFVIMGId is a Querydsl query type for GTCFVIMGId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QGTCFVIMGId extends BeanPath<GTCFVIMGId> {

    private static final long serialVersionUID = 413863530L;

    public static final QGTCFVIMGId gTCFVIMGId = new QGTCFVIMGId("gTCFVIMGId");

    public final NumberPath<Integer> cdEmpresa = createNumber("cdEmpresa", Integer.class);

    public final NumberPath<Integer> cdSequencia = createNumber("cdSequencia", Integer.class);

    public final NumberPath<Integer> nrFicha = createNumber("nrFicha", Integer.class);

    public QGTCFVIMGId(String variable) {
        super(GTCFVIMGId.class, forVariable(variable));
    }

    public QGTCFVIMGId(Path<? extends GTCFVIMGId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGTCFVIMGId(PathMetadata metadata) {
        super(GTCFVIMGId.class, metadata);
    }

}

