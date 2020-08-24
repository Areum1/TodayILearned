class Blog{
    constructor(){
        this.registerEvents();
        this.likedSet = new Set();
    }

    registerEvents(){
        const dataURL = "/data/data.json";
        const blogList = document.querySelector(".blogList > ul");
        const startBtn = document.querySelector(".start");

        startBtn.addEventListener("click", () =>{
            this.setInitData(dataURL);            
        });

        blogList.addEventListener("click",(evt)=> {
            const targetClassName = evt.target.className;
            const postTitle = evt.target.previousElementSibling.textContent;

            // className이 like라면 찜하기 목록을 추가한다.
            if(targetClassName !== "like" && targetClassName !== "unlike") return;

            // 찜 취소를 클릭한 경우에, 찜하기로 다시 변경하고, 찜목록을 제거하고, 찜 목록뷰를 렌더링한다.
            if(targetClassName === "unlike"){
                evt.target.className = "like";
                evt.target.innerText = "찜하기";

                this.likedSet.delete(postTitle);
            } else{
                // 찜 목록에 추가
                this.likedSet.add(postTitle);

                // 찜 된 목록(div)의 클래스를 like에서 unlike로 변경하기.
                evt.target.className = "unlike";
                evt.target.innerText = "찜취소";
            }

            // 내 찜 목록 뷰에 추가
            this.updateLikedList();
        });
    }

    updateLikedList(){
        const ul = document.querySelector(".like-list > ul");
        let likedSum = "";

        // li 태그에 찜리스트를 넣고 한번에 innerHTML을 사용한다.
        this.likedSet.forEach((v) => {
            likedSum += `<li>${v}</li>`
        });
        ul.innerHTML = likedSum;
    }

    setInitData(dataURL){
        this.getData(dataURL, this.insertPosts);
        // do something...   
    }
    getData(dataURL, fn){
        const oReq = new XMLHttpRequest();
        oReq.addEventListener("load",()=>{
            const list = JSON.parse(oReq.responseText).body;
            fn(list);
        });

        oReq.open('Get',dataURL);
        oReq.send();
    }

    insertPosts(list){
        const ul = document.querySelector(".blogList > ul");

        list.forEach((v)=> {
            ul.innerHTML += `
            <li>
                <a href=${v.link}> ${v.title} </a> 
                <div class="like">찜하기</div>
            </li>`;
        })
    }
}

export default Blog;