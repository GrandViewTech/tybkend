const authorize=(header:String)=>
{
    if (header) 
    {
        const token = header.split(' ')[1];
        console.log("Token : "+token)
    }
}
export default { authorize };