CREATE TABLE IF NOT EXISTS public.group
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT group_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;