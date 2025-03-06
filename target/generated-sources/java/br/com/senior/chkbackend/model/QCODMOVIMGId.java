package br.com.senior.chkbackend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCODMOVIMGId is a Querydsl query type for CODMOVIMGId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QCODMOVIMGId extends BeanPath<CODMOVIMGId> {

    private static final long serialVersionUID = -221308304L;

    public static final QCODMOVIMGId cODMOVIMGId = new QCODMOVIMGId("cODMOVIMGId");

    public final NumberPath<Integer> cdEmpresa = createNumber("cdEmpresa", Integer.class);

    public final NumberPath<Integer> cdSeqImag = createNumber("cdSeqImag", Integer.class);

    public final NumberPath<Integer> cdSequencia = createNumber("cdSequencia", Integer.class);

    public QCODMOVIMGId(String variable) {
        super(CODMOVIMGId.class, forVariable(variable));
    }

    public QCODMOVIMGId(Path<? extends CODMOVIMGId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCODMOVIMGId(PathMetadata metadata) {
        super(CODMOVIMGId.class, metadata);
    }

}

