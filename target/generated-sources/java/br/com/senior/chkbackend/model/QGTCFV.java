package br.com.senior.chkbackend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGTCFV is a Querydsl query type for GTCFV
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGTCFV extends EntityPathBase<GTCFV> {

    private static final long serialVersionUID = 1726347828L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGTCFV gTCFV = new QGTCFV("gTCFV");

    public final QGTCFVId pk;

    public QGTCFV(String variable) {
        this(GTCFV.class, forVariable(variable), INITS);
    }

    public QGTCFV(Path<? extends GTCFV> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGTCFV(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGTCFV(PathMetadata metadata, PathInits inits) {
        this(GTCFV.class, metadata, inits);
    }

    public QGTCFV(Class<? extends GTCFV> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pk = inits.isInitialized("pk") ? new QGTCFVId(forProperty("pk")) : null;
    }

}

