package br.com.senior.chkbackend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCODMOV is a Querydsl query type for CODMOV
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCODMOV extends EntityPathBase<CODMOV> {

    private static final long serialVersionUID = 1858077294L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCODMOV cODMOV = new QCODMOV("cODMOV");

    public final NumberPath<Integer> cdGrupoConferente = createNumber("cdGrupoConferente", Integer.class);

    public final StringPath dsUsuarioFechamento = createString("dsUsuarioFechamento");

    public final DateTimePath<java.util.Calendar> dtFechamento = createDateTime("dtFechamento", java.util.Calendar.class);

    public final DateTimePath<java.util.Calendar> dtMovimento = createDateTime("dtMovimento", java.util.Calendar.class);

    public final NumberPath<Integer> inOrigemCadastro = createNumber("inOrigemCadastro", Integer.class);

    public final NumberPath<Integer> inTipoMovimento = createNumber("inTipoMovimento", Integer.class);

    public final StringPath nrPlaca = createString("nrPlaca");

    public final QCODMOVId pk;

    public QCODMOV(String variable) {
        this(CODMOV.class, forVariable(variable), INITS);
    }

    public QCODMOV(Path<? extends CODMOV> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCODMOV(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCODMOV(PathMetadata metadata, PathInits inits) {
        this(CODMOV.class, metadata, inits);
    }

    public QCODMOV(Class<? extends CODMOV> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pk = inits.isInitialized("pk") ? new QCODMOVId(forProperty("pk")) : null;
    }

}

