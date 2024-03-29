PGDMP
     9                    z            blueFashion    14.1    14.1 Y    W
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            X
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            Y
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            Z
           1262    24701    blueFashion    DATABASE     j   CREATE DATABASE "blueFashion" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE "blueFashion";
                postgres    false            �            1259    25145 	   addresses    TABLE       CREATE TABLE public.addresses (
    address_id integer NOT NULL,
    address_county character varying(255),
    address_district character varying(255),
    address_first_name character varying(255),
    address_full_address character varying(255),
    address_last_name character varying(255),
    address_mail character varying(255),
    address_phone_number character varying(255),
    address_post_code character varying(255),
    address_province character varying(255),
    address_title character varying(255),
    user_id integer
);
    DROP TABLE public.addresses;
       public         heap    postgres    false            �            1259    25144    addresses_address_id_seq    SEQUENCE     �   CREATE SEQUENCE public.addresses_address_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.addresses_address_id_seq;
       public          postgres    false    218            [
           0    0    addresses_address_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.addresses_address_id_seq OWNED BY public.addresses.address_id;
          public          postgres    false    217            �            1259    50858    brands    TABLE     e   CREATE TABLE public.brands (
    brand_id integer NOT NULL,
    brand_name character varying(255)
);
    DROP TABLE public.brands;
       public         heap    postgres    false            �            1259    50857    brands_brand_id_seq    SEQUENCE     �   CREATE SEQUENCE public.brands_brand_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.brands_brand_id_seq;
       public          postgres    false    226            \
           0    0    brands_brand_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.brands_brand_id_seq OWNED BY public.brands.brand_id;
          public          postgres    false    225            �            1259    25155 
   categories    TABLE     �   CREATE TABLE public.categories (
    category_id integer NOT NULL,
    category_name character varying(255),
    parent_id integer
);
    DROP TABLE public.categories;
       public         heap    postgres    false            �            1259    25154    categories_category_id_seq    SEQUENCE     �   CREATE SEQUENCE public.categories_category_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.categories_category_id_seq;
       public          postgres    false    220            ]
           0    0    categories_category_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.categories_category_id_seq OWNED BY public.categories.category_id;
          public          postgres    false    219            �            1259    24703    colors    TABLE     e   CREATE TABLE public.colors (
    color_id integer NOT NULL,
    color_name character varying(255)
);
    DROP TABLE public.colors;
       public         heap    postgres    false            �            1259    24702    colors_color_id_seq    SEQUENCE     �   CREATE SEQUENCE public.colors_color_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.colors_color_id_seq;
       public          postgres    false    210            ^
           0    0    colors_color_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.colors_color_id_seq OWNED BY public.colors.color_id;
          public          postgres    false    209            �            1259    25181    comments    TABLE     ,  CREATE TABLE public.comments (
    comment_id integer NOT NULL,
    comment_content character varying(255),
    comment_create_date timestamp without time zone,
    comment_score integer,
    comment_title character varying(255),
    parent_id integer,
    product_id integer,
    user_id integer
);
    DROP TABLE public.comments;
       public         heap    postgres    false            �            1259    25180    comments_comment_id_seq    SEQUENCE     �   CREATE SEQUENCE public.comments_comment_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.comments_comment_id_seq;
       public          postgres    false    222            _
           0    0    comments_comment_id_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.comments_comment_id_seq OWNED BY public.comments.comment_id;
          public          postgres    false    221            �            1259    24780    images    TABLE     �   CREATE TABLE public.images (
    image_id integer NOT NULL,
    image_subinfo character varying(255),
    image_url character varying(255)
);
    DROP TABLE public.images;
       public         heap    postgres    false            �            1259    24779    images_image_id_seq    SEQUENCE     �   CREATE SEQUENCE public.images_image_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.images_image_id_seq;
       public          postgres    false    212            `
           0    0    images_image_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.images_image_id_seq OWNED BY public.images.image_id;
          public          postgres    false    211            �            1259    50802    products    TABLE     �  CREATE TABLE public.products (
    product_id integer NOT NULL,
    product_brand character varying(255),
    product_description character varying(255),
    product_discount_price double precision,
    product_price double precision,
    product_size character varying(255),
    product_title character varying(255),
    category_id integer,
    color_id integer,
    product_image_id integer,
    user_id integer,
    brand_id integer,
    size_id integer
);
    DROP TABLE public.products;
       public         heap    postgres    false            �            1259    50801    products_product_id_seq    SEQUENCE     �   CREATE SEQUENCE public.products_product_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.products_product_id_seq;
       public          postgres    false    224            a
           0    0    products_product_id_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.products_product_id_seq OWNED BY public.products.product_id;
          public          postgres    false    223            �            1259    24789 	   shippings    TABLE     G  CREATE TABLE public.shippings (
    shipping_id integer NOT NULL,
    shipping_company character varying(255),
    shipping_date character varying(255),
    shipping_payment_method character varying(255),
    shipping_price character varying(255),
    shipping_tracking_number character varying(255),
    address_id integer
);
    DROP TABLE public.shippings;
       public         heap    postgres    false            �            1259    24788    shippings_shipping_id_seq    SEQUENCE     �   CREATE SEQUENCE public.shippings_shipping_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.shippings_shipping_id_seq;
       public          postgres    false    214            b
           0    0    shippings_shipping_id_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.shippings_shipping_id_seq OWNED BY public.shippings.shipping_id;
          public          postgres    false    213            �            1259    50865    sizes    TABLE     {   CREATE TABLE public.sizes (
    size_id integer NOT NULL,
    size_name character varying(255),
    category_id integer
);
    DROP TABLE public.sizes;
       public         heap    postgres    false            �            1259    50864    sizes_size_id_seq    SEQUENCE     �   CREATE SEQUENCE public.sizes_size_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.sizes_size_id_seq;
       public          postgres    false    228            c
           0    0    sizes_size_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.sizes_size_id_seq OWNED BY public.sizes.size_id;
          public          postgres    false    227            �            1259    24879    users    TABLE     �  CREATE TABLE public.users (
    user_id integer NOT NULL,
    user_about character varying(255),
    user_country character varying(255),
    user_first_name character varying(255),
    user_last_name character varying(255),
    user_mail character varying(255),
    user_name character varying(255),
    user_password character varying(255),
    user_register_date timestamp without time zone,
    user_seller character varying(255),
    cover_image_id integer,
    profile_image_id integer
);
    DROP TABLE public.users;
       public         heap    postgres    false            �            1259    24878    users_user_id_seq    SEQUENCE     �   CREATE SEQUENCE public.users_user_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.users_user_id_seq;
       public          postgres    false    216            d
           0    0    users_user_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.users_user_id_seq OWNED BY public.users.user_id;
          public          postgres    false    215            �           2604    25148    addresses address_id    DEFAULT     |   ALTER TABLE ONLY public.addresses ALTER COLUMN address_id SET DEFAULT nextval('public.addresses_address_id_seq'::regclass);
 C   ALTER TABLE public.addresses ALTER COLUMN address_id DROP DEFAULT;
       public          postgres    false    217    218    218            �           2604    50861    brands brand_id    DEFAULT     r   ALTER TABLE ONLY public.brands ALTER COLUMN brand_id SET DEFAULT nextval('public.brands_brand_id_seq'::regclass);
 >   ALTER TABLE public.brands ALTER COLUMN brand_id DROP DEFAULT;
       public          postgres    false    225    226    226            �           2604    25158    categories category_id    DEFAULT     �   ALTER TABLE ONLY public.categories ALTER COLUMN category_id SET DEFAULT nextval('public.categories_category_id_seq'::regclass);
 E   ALTER TABLE public.categories ALTER COLUMN category_id DROP DEFAULT;
       public          postgres    false    219    220    220            �           2604    24706    colors color_id    DEFAULT     r   ALTER TABLE ONLY public.colors ALTER COLUMN color_id SET DEFAULT nextval('public.colors_color_id_seq'::regclass);
 >   ALTER TABLE public.colors ALTER COLUMN color_id DROP DEFAULT;
       public          postgres    false    210    209    210            �           2604    25184    comments comment_id    DEFAULT     z   ALTER TABLE ONLY public.comments ALTER COLUMN comment_id SET DEFAULT nextval('public.comments_comment_id_seq'::regclass);
 B   ALTER TABLE public.comments ALTER COLUMN comment_id DROP DEFAULT;
       public          postgres    false    221    222    222            �           2604    24783    images image_id    DEFAULT     r   ALTER TABLE ONLY public.images ALTER COLUMN image_id SET DEFAULT nextval('public.images_image_id_seq'::regclass);
 >   ALTER TABLE public.images ALTER COLUMN image_id DROP DEFAULT;
       public          postgres    false    212    211    212            �           2604    50805    products product_id    DEFAULT     z   ALTER TABLE ONLY public.products ALTER COLUMN product_id SET DEFAULT nextval('public.products_product_id_seq'::regclass);
 B   ALTER TABLE public.products ALTER COLUMN product_id DROP DEFAULT;
       public          postgres    false    224    223    224            �           2604    24792    shippings shipping_id    DEFAULT     ~   ALTER TABLE ONLY public.shippings ALTER COLUMN shipping_id SET DEFAULT nextval('public.shippings_shipping_id_seq'::regclass);
 D   ALTER TABLE public.shippings ALTER COLUMN shipping_id DROP DEFAULT;
       public          postgres    false    213    214    214            �           2604    50868 
   sizes size_id    DEFAULT     n   ALTER TABLE ONLY public.sizes ALTER COLUMN size_id SET DEFAULT nextval('public.sizes_size_id_seq'::regclass);
 <   ALTER TABLE public.sizes ALTER COLUMN size_id DROP DEFAULT;
       public          postgres    false    228    227    228            �           2604    24882 
   users user_id    DEFAULT     n   ALTER TABLE ONLY public.users ALTER COLUMN user_id SET DEFAULT nextval('public.users_user_id_seq'::regclass);
 <   ALTER TABLE public.users ALTER COLUMN user_id DROP DEFAULT;
       public          postgres    false    215    216    216            J
          0    25145 	   addresses 
   TABLE DATA           �   COPY public.addresses (address_id, address_county, address_district, address_first_name, address_full_address, address_last_name, address_mail, address_phone_number, address_post_code, address_province, address_title, user_id) FROM stdin;
    public          postgres    false    218   Co       R
          0    50858    brands 
   TABLE DATA           6   COPY public.brands (brand_id, brand_name) FROM stdin;
    public          postgres    false    226   �o       L
          0    25155 
   categories 
   TABLE DATA           K   COPY public.categories (category_id, category_name, parent_id) FROM stdin;
    public          postgres    false    220   'q       B
          0    24703    colors 
   TABLE DATA           6   COPY public.colors (color_id, color_name) FROM stdin;
    public          postgres    false    210   �q       N
          0    25181    comments 
   TABLE DATA           �   COPY public.comments (comment_id, comment_content, comment_create_date, comment_score, comment_title, parent_id, product_id, user_id) FROM stdin;
    public          postgres    false    222   Er       D
          0    24780    images 
   TABLE DATA           D   COPY public.images (image_id, image_subinfo, image_url) FROM stdin;
    public          postgres    false    212   �r       P
          0    50802    products 
   TABLE DATA           �   COPY public.products (product_id, product_brand, product_description, product_discount_price, product_price, product_size, product_title, category_id, color_id, product_image_id, user_id, brand_id, size_id) FROM stdin;
    public          postgres    false    224   �t       F
          0    24789 	   shippings 
   TABLE DATA           �   COPY public.shippings (shipping_id, shipping_company, shipping_date, shipping_payment_method, shipping_price, shipping_tracking_number, address_id) FROM stdin;
    public          postgres    false    214   Tw       T
          0    50865    sizes 
   TABLE DATA           @   COPY public.sizes (size_id, size_name, category_id) FROM stdin;
    public          postgres    false    228   �w       H
          0    24879    users 
   TABLE DATA           �   COPY public.users (user_id, user_about, user_country, user_first_name, user_last_name, user_mail, user_name, user_password, user_register_date, user_seller, cover_image_id, profile_image_id) FROM stdin;
    public          postgres    false    216   �w       e
           0    0    addresses_address_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.addresses_address_id_seq', 4, true);
          public          postgres    false    217            f
           0    0    brands_brand_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.brands_brand_id_seq', 36, true);
          public          postgres    false    225            g
           0    0    categories_category_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.categories_category_id_seq', 70, true);
          public          postgres    false    219            h
           0    0    colors_color_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.colors_color_id_seq', 13, true);
          public          postgres    false    209            i
           0    0    comments_comment_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.comments_comment_id_seq', 23, true);
          public          postgres    false    221            j
           0    0    images_image_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.images_image_id_seq', 91, true);
          public          postgres    false    211            k
           0    0    products_product_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.products_product_id_seq', 35, true);
          public          postgres    false    223            l
           0    0    shippings_shipping_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.shippings_shipping_id_seq', 1, true);
          public          postgres    false    213            m
           0    0    sizes_size_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.sizes_size_id_seq', 14, true);
          public          postgres    false    227            n
           0    0    users_user_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.users_user_id_seq', 32, true);
          public          postgres    false    215            �           2606    25152    addresses addresses_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.addresses
    ADD CONSTRAINT addresses_pkey PRIMARY KEY (address_id);
 B   ALTER TABLE ONLY public.addresses DROP CONSTRAINT addresses_pkey;
       public            postgres    false    218            �           2606    50863    brands brands_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.brands
    ADD CONSTRAINT brands_pkey PRIMARY KEY (brand_id);
 <   ALTER TABLE ONLY public.brands DROP CONSTRAINT brands_pkey;
       public            postgres    false    226            �           2606    25160    categories categories_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pkey PRIMARY KEY (category_id);
 D   ALTER TABLE ONLY public.categories DROP CONSTRAINT categories_pkey;
       public            postgres    false    220            �           2606    24708    colors colors_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.colors
    ADD CONSTRAINT colors_pkey PRIMARY KEY (color_id);
 <   ALTER TABLE ONLY public.colors DROP CONSTRAINT colors_pkey;
       public            postgres    false    210            �           2606    25188    comments comments_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.comments
    ADD CONSTRAINT comments_pkey PRIMARY KEY (comment_id);
 @   ALTER TABLE ONLY public.comments DROP CONSTRAINT comments_pkey;
       public            postgres    false    222            �           2606    24787    images images_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.images
    ADD CONSTRAINT images_pkey PRIMARY KEY (image_id);
 <   ALTER TABLE ONLY public.images DROP CONSTRAINT images_pkey;
       public            postgres    false    212            �           2606    50809    products products_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (product_id);
 @   ALTER TABLE ONLY public.products DROP CONSTRAINT products_pkey;
       public            postgres    false    224            �           2606    24796    shippings shippings_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.shippings
    ADD CONSTRAINT shippings_pkey PRIMARY KEY (shipping_id);
 B   ALTER TABLE ONLY public.shippings DROP CONSTRAINT shippings_pkey;
       public            postgres    false    214            �           2606    50870    sizes sizes_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.sizes
    ADD CONSTRAINT sizes_pkey PRIMARY KEY (size_id);
 :   ALTER TABLE ONLY public.sizes DROP CONSTRAINT sizes_pkey;
       public            postgres    false    228            �           2606    24886    users users_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (user_id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    216            �           2606    50810 %   addresses fk1fa36y2oqhao3wgg2rw1pi459 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.addresses
    ADD CONSTRAINT fk1fa36y2oqhao3wgg2rw1pi459 FOREIGN KEY (user_id) REFERENCES public.users(user_id);
 O   ALTER TABLE ONLY public.addresses DROP CONSTRAINT fk1fa36y2oqhao3wgg2rw1pi459;
       public          postgres    false    3226    216    218            �           2606    50815 $   comments fk6uv0qku8gsu6x1r2jkrtqwjtn 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.comments
    ADD CONSTRAINT fk6uv0qku8gsu6x1r2jkrtqwjtn FOREIGN KEY (product_id) REFERENCES public.products(product_id);
 N   ALTER TABLE ONLY public.comments DROP CONSTRAINT fk6uv0qku8gsu6x1r2jkrtqwjtn;
       public          postgres    false    3234    222    224            �           2606    50820 $   comments fk8omq0tc18jd43bu5tjh6jvraq 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.comments
    ADD CONSTRAINT fk8omq0tc18jd43bu5tjh6jvraq FOREIGN KEY (user_id) REFERENCES public.users(user_id);
 N   ALTER TABLE ONLY public.comments DROP CONSTRAINT fk8omq0tc18jd43bu5tjh6jvraq;
       public          postgres    false    3226    222    216            �           2606    50876 $   products fka3a4mpsfdf4d2y6r8ra3sc8mv 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.products
    ADD CONSTRAINT fka3a4mpsfdf4d2y6r8ra3sc8mv FOREIGN KEY (brand_id) REFERENCES public.brands(brand_id);
 N   ALTER TABLE ONLY public.products DROP CONSTRAINT fka3a4mpsfdf4d2y6r8ra3sc8mv;
       public          postgres    false    224    226    3236            �           2606    50845 %   shippings fkcw5uutxaevbdg0idm695a5bqf 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.shippings
    ADD CONSTRAINT fkcw5uutxaevbdg0idm695a5bqf FOREIGN KEY (address_id) REFERENCES public.addresses(address_id);
 O   ALTER TABLE ONLY public.shippings DROP CONSTRAINT fkcw5uutxaevbdg0idm695a5bqf;
       public          postgres    false    3228    218    214            �           2606    50840 $   products fkdb050tk37qryv15hd932626th 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkdb050tk37qryv15hd932626th FOREIGN KEY (user_id) REFERENCES public.users(user_id);
 N   ALTER TABLE ONLY public.products DROP CONSTRAINT fkdb050tk37qryv15hd932626th;
       public          postgres    false    224    216    3226            �           2606    24892 !   users fke9m3buhrd541cj89320px18t4 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.users
    ADD CONSTRAINT fke9m3buhrd541cj89320px18t4 FOREIGN KEY (profile_image_id) REFERENCES public.images(image_id);
 K   ALTER TABLE ONLY public.users DROP CONSTRAINT fke9m3buhrd541cj89320px18t4;
       public          postgres    false    212    3222    216            �           2606    50830 $   products fkebociq5k3b2tkcxh3q5dg4eed 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkebociq5k3b2tkcxh3q5dg4eed FOREIGN KEY (color_id) REFERENCES public.colors(color_id);
 N   ALTER TABLE ONLY public.products DROP CONSTRAINT fkebociq5k3b2tkcxh3q5dg4eed;
       public          postgres    false    3220    224    210            �           2606    50881 $   products fkjtp03phh84ohguj0rhvlk81g7 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkjtp03phh84ohguj0rhvlk81g7 FOREIGN KEY (size_id) REFERENCES public.sizes(size_id);
 N   ALTER TABLE ONLY public.products DROP CONSTRAINT fkjtp03phh84ohguj0rhvlk81g7;
       public          postgres    false    228    3238    224            �           2606    25189 $   comments fklri30okf66phtcgbe5pok7cc0 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.comments
    ADD CONSTRAINT fklri30okf66phtcgbe5pok7cc0 FOREIGN KEY (parent_id) REFERENCES public.comments(comment_id);
 N   ALTER TABLE ONLY public.comments DROP CONSTRAINT fklri30okf66phtcgbe5pok7cc0;
       public          postgres    false    222    3232    222            �           2606    50871 !   sizes fknosqylolcsi5l4h9nnouym9xc 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.sizes
    ADD CONSTRAINT fknosqylolcsi5l4h9nnouym9xc FOREIGN KEY (category_id) REFERENCES public.categories(category_id);
 K   ALTER TABLE ONLY public.sizes DROP CONSTRAINT fknosqylolcsi5l4h9nnouym9xc;
       public          postgres    false    220    228    3230            �           2606    50835 $   products fko0hxhfdd06ow2i5acxgvqyu0e 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.products
    ADD CONSTRAINT fko0hxhfdd06ow2i5acxgvqyu0e FOREIGN KEY (product_image_id) REFERENCES public.images(image_id);
 N   ALTER TABLE ONLY public.products DROP CONSTRAINT fko0hxhfdd06ow2i5acxgvqyu0e;
       public          postgres    false    212    3222    224            �           2606    50825 $   products fkog2rp4qthbtt2lfyhfo32lsw9 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkog2rp4qthbtt2lfyhfo32lsw9 FOREIGN KEY (category_id) REFERENCES public.categories(category_id);
 N   ALTER TABLE ONLY public.products DROP CONSTRAINT fkog2rp4qthbtt2lfyhfo32lsw9;
       public          postgres    false    220    224    3230            �           2606    25161 &   categories fksaok720gsu4u2wrgbk10b5n8d 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.categories
    ADD CONSTRAINT fksaok720gsu4u2wrgbk10b5n8d FOREIGN KEY (parent_id) REFERENCES public.categories(category_id);
 P   ALTER TABLE ONLY public.categories DROP CONSTRAINT fksaok720gsu4u2wrgbk10b5n8d;
       public          postgres    false    220    220    3230            �           2606    24887 !   users fksyrt41y1t3itugh1cypek435i 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.users
    ADD CONSTRAINT fksyrt41y1t3itugh1cypek435i FOREIGN KEY (cover_image_id) REFERENCES public.images(image_id);
 K   ALTER TABLE ONLY public.users DROP CONSTRAINT fksyrt41y1t3itugh1cypek435i;
       public          postgres    false    216    3222    212            J
   �   x�U�=�0Fg�>A�Hn��bՑ5I�4 ��4l��T�l�{�_41M���q뼑�/� ��à��7ؓ��&���QO���`|�ˀ1���Q��Ɵ!'���k��;���#c�ntP��,USV'ESK��q}"qHN��gB��zF�      R
   '  x�=�Mr�0���)r;�.�C�eʶ4�c;� ���gG{��EY����f���GB
E����Cѱř��oG�ek	�PX˟����.e	WP�@�`p�����>�ljQM_p��0�RPr��֦�JC�oWT9��;T�W�|ܯ�{��|`�j�2*K1��l/@B�_�P-��|@����tj��h7r��z
��w����sD���s�v���(�t��DN�3����G=�
š��6�t�g-��������,��	���̧�P<�&v����ƌ��yÀ����89�Qp?&��{z      L
   �   x�E�1�@D��Sp�.H	���@I�[�E0�$x/a�h���{�jA�f��I9�g�G�b�Sݓa�p$��X&#Bݩ�J�Qª��9�I��Ҵ��LJDT�ޠ�L�U�
�����G2�n���LH���<�bE��f<�e�<7C"�N�j��#�S . }����@�c�}��B�      B
   K   x�3��IL�,K-*�2��M,��2�t�/J��2��>��(��ƪ#�L9CJ�J�K��9݋2�
8�R��b���� �;�      N
   M   x�32�LJMI��T�KM�,�4202�50�54Q04�2��25�310�44�<�<?[!����?NCcN#s�=... �h�      D
   0  x����z�0���*���ߥ(J|���E�H$
Ѫw�ͬf�^�X"nd�ޗ�/''� � ��,�ȧ�S�~q:LS�qCL(0�}�6��!ʟ=�]��?��aC��
����������$5�h�b��,Fq?F��,��W����(��4��Le��p(ˣ3�_n�F9:�{�栐��-<�/c�Q��$�i"	k&4A;������`�"&�[�Q&]Wh���k�`���ǽ��u���
b��ۀq�aN}i�3$�F'�����s����$|J��E:d��n���$VL$&(��Y���U�̄���du����{~`�V&�M�� 0U���[�=�U6����W�7�0�­��������Ѻr:a�v�x���cA�t;G��L�͂�b0l54ۖ�3V�eÑ;t,��X���g���{�X�68��r8���r�U���4��+s�zL�ʲ���p��?u�[ah|ٱ:E {M}�b�4�#\����8
&V�	fdue���\q�����}����.׊m+�a�K
^��/���ͼ[�	̌q�O�F�/� 
�      P
   b  x�mT���0��_�/�I�<A� � �t��8扖������Bܤ���e��e)�B rvggf�5<~���v�8(!@�>�o�P�����:�=X	�
���a���6>��'���eF~ib~�UP	�J�ʊ��~��{_�~u>Ba�+,����x��4�
�Ǵ�K��۔�=~���ǆ/��mv/]&.�bZ͘+d]���o�K���
7��k[�O�#ϊ�rJ���kpQ/���z��蠰T1�e�N;#\I�*w.n�!�����AqD�����51�v�/C�b
��Ԃ`�V�P���H]ک�7�Df��~n� �f�
3��J5��*gݜ�����!�(�S 
m�5z��*�QL��SѨ�j`_�d��m6��1��.%ߜ�is>��	C��T�Ͼ�iېO`Q:7��\r�k�݁_K�&���h,��eK
�ef��5}�C�"�֡0V9��׽]�5�TG
�U.�h�l�O=q]��D^���gtDwu�29���f���h��Tg��Pv-��ELɩ#O��;�-z�{��N���Z�=&���X�拪�!;��)w�����6� #�9����+�O�Tz|����_�      F
   ?   x�3�t,J,�40�30�3202�t?�-/%�(39S����ԜLNNC#cS3�?�=... �
      T
   H   x�ʻ�0��ZoN��AEC��s��t��)9��'>���Wu��Ѫ�Or�:a?�dʾo�C�a�
      H
   �  x�m��v�8�k�)\����
W�H���6��ؖA�!�A�-��4[����*\Β�Fǣ3�~���A���[s�<
v�$�QR�a�c�4"�Ta�����$�4�^�H�u|���j���*|�����o��z�S�bE&�O'~%H�Ѿ�)U��Ii�]��պ�E�\Uw
�t��m�� ��+�>C�m?x@3rx]�D��KBCs��U�sѨX�(��qk��4�fel�[Ӯ4:~�V��:mwY�v�~���j�kj�1���H�
��h�	@@"~'==f1G"�l���ټ�VM:�5'5���C�p������zw�a�SJ�9�����"��}�	F�){%��0*#?��f4R>�t̉���0- R��
�~���~���O��a5Ĥ�>�}�{����8���/Z�c%(Ե���ɛ$-
�j�*�Z=w*$�]wM�U��z�WK	n��;!�ձ�x��a��~x/��U�jU57E����R��b���)��U�	'V6���~��r���V:�g��e�hHQUהjC
G���hĜDJm���_�OW�,�2�I��(��ۏDp�P�%H���F.��|��pE
IYH�O9T�]�}yÈ��E$������b��4T�rؙ�<c��4J�|�
<���0�\K#(ۏ���a�AO)�?+�U�@|���u����L�)��~o��j}��y�=t),���Zs�3�ϫ�����h5�����TMё�i_� �d���m緦�R9���p�� �l�Sڑ��q.2�\0{�>�%:ODW���ܬ�����(^���s7l��)'z���u���83(�똌�H�4�3�C����*h�,
ZD���=z�يg�B�3(���HK��,fd\��I%-hj�E_�g�e�G �>�L��p$:�p_;'64OԲ����|\��wv��j%��/����>�嬨�c�k�!ɞ[�6�qM:����WWW�$� 0     